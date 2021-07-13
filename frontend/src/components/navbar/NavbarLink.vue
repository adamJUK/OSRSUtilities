<template>
  <NavbarElement>
    <router-link :to="url"
                 class='text-sm font-semibold pb-2 border-b-4 border-old-school-cream border-opacity-0 hover:border-opacity-100 focus:border-opacity-100
                 outline-none'
                 :class='[ css ]'>
      <slot></slot>
    </router-link>
  </NavbarElement>
</template>

<script>
import NavbarElement from './NavbarElement.vue'
export default {
  components: {
    NavbarElement,
  },
  props: {
    url: {
      type: Object,
      required: true,
    },
    css: {
      type: String,
      required: false,
    },
  },
};
</script>