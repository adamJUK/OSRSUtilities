<template>
<nav class='p-3 flex justify-between'>
  <div class='flex flex-row gap-4'> 
      <NavbarLink :url="{ name: 'home' }" css='font-bold sm:text-lg text-old-school-cream'>
        OSRSUtilities
      </NavbarLink>
  </div>
  <div class='flex-grow flex flex-row gap-4 justify-end items-center'>
    <template v-if='!this.authenticated'>
    <FancyButton variant='primary' type='button'
                 @click="login">Login</FancyButton>
    </template>
    <template v-else>
    <FancyButton variant='primary' type='button'
                 @click="logout">Logout</FancyButton>
    </template>
  </div>

</nav>
</template>

<script>
import NavbarLink from './NavbarLink.vue'
import FancyButton from '../atoms/FancyButton.vue'
import AuthService from '../../auth/AuthService'

const auth = new AuthService()
export default {
  name: 'Navbar',
  components: {
    NavbarLink,
    FancyButton
  },
  props: {
  },
  data () {
    this.handleAuthentication()
    this.authenticated = false

    auth.authNotifier.on('authChange', authState => {
      this.authenticated = authState.authenticated
    })

    return {
      authenticated: false,
    }
  },
  methods: {
    login () {
      auth.login()
    },
    logout () {
      auth.logout()
    },
    handleAuthentication () {
      auth.handleAuthentication()
    },
  }
}
</script>
