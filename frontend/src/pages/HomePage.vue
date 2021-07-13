<template>
  <div>

    <section id='hero' class='bg-old-school-maroon'>
    <div class='container mx-auto max-w-screen-lg bg-old-school-maroon'>
    <Navbar/>
    </div>
    </section>

  </div>
</template>

<script>
import Navbar from '../components/navbar/Navbar.vue'

export default {
  name: 'HomePage',
  components: {
    Navbar
  },
  methods: {
  }
}
</script>