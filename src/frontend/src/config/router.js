import { createRouter, createWebHistory } from "vue-router";
import HomePage from "@/pages/HomePage";
import Test from "@/pages/Test";
import MyLoadouts from "@/pages/loadouts/MyLoadouts";

const routes = [
    {
        path: "",
        name: "HomePage",
        component: HomePage,
    },
    {
        path: "/test",
        name: "Test",
        component: Test,
    },
    {
        path: "/loadouts",
        name: "Loadouts",
        component: MyLoadouts,
    },
    {
        path: "/login",
        name: "Login",
        beforeEnter() {
            location.href = 'http://localhost:9000/sso/login'
        }
    },
    {
        path: "/logout",
        name: "Logout",
        beforeEnter() {
            location.href = 'http://localhost:9000/sso/logout'
        }
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;