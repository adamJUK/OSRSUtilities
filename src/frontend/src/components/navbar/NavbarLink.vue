<template>
    <div class="h-10 leading-10">
        <router-link :to="url"
                     class="text-xl font-bold pb-2 border-b-4 border-OSRS-maroon
                     border-opacity-0 hover:border-opacity-100 focus:border-opacity-100
                 outline-none">
            <slot></slot>
        </router-link>
    </div>
</template>

<script>
export default {
    components: {
    },
    props: {
        url: {
            type: Object,
            required: true,
        },
    },
};
</script>