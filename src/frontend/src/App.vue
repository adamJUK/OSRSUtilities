<template>
    <div class="min-h-screen font-open-sans text-gray-800 bg-gray-50 dark:text-gray-200 dark:bg-gray-800">
        <router-view :key="$route.fullPath"/>
    </div>
</template>

<script>
export default {
  name: 'App',
  components: {
  },
}
</script>
