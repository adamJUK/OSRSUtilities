<template>
  <div class='h-10 leading-10'>
    <button v-if="type === 'button'" @click="() => this.$emit('click')" :class="[ sharedCss, getVariantCss ]">
      <slot></slot>
    </button>
  </div>
</template>

<script>
const SHARED_CSS = 'text-sm font-semibold pb-2 border-b-4 border-old-school-cream border-opacity-0 hover:border-opacity-100 focus:border-opacity-100 outline-none'
const PRIMARY = 'primary'
const PRIMARY_CSS = 'font-bold sm:text-lg text-old-school-cream'

export default {
    name: 'FancyButton',
    props: {
        type: {
            required: true,
            validator: (value) => ['button', 'link'].indexOf(value) !== -1,
        },
        link: {
            type: Object,
        },
        linkReplace: {
            default: false,
            type: Boolean,
        },  
        linkAppend: {
            default: false,
            type: Boolean,
        },
        variant: {
            required: true,
            validator: (value) => [PRIMARY].indexOf(value) !== -1,
        },
        css: {
            type: String,
            required: false,
        },
    },
    data() {
        return {
            sharedCss: SHARED_CSS,
        };
    },
    computed: {
        getVariantCss() {
            switch (this.variant) {
                case PRIMARY:
                    return PRIMARY_CSS;
                default:
                    return "";
            }
        }
    }
}
</script>
