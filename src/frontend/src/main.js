import { createApp } from 'vue'
import App from './App.vue'
import './assets/style.css'
import Keycloak from 'keycloak-js'
import router from './config/router'

let initOptions = {
    url: 'http://127.0.0.1:8080/auth', realm: 'OSRSUtilities', clientId: 'OSRSUtilities', onLoad: 'login-required'
};


let keycloak = Keycloak(initOptions);

keycloak.init({onLoad: initOptions.onLoad}).then((auth) => {
    if (!auth) {
        window.location.reload();
    } else {
        const OSRSUtilitiesApp = createApp(App)
        OSRSUtilitiesApp
            .use(router)
            .component('props', {props: {keycloak}})
            .mount('#app')
    }


//Token Refresh
    setInterval(() => {
        keycloak.updateToken(70);
    }, 6000)

});
