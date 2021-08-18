<template>
    <div class="shadow ring-1 ring-black ring-opacity-5 border-OSRS-maroon border-t-4
  bg-white p-5">
        <div class="flex flex-col">
            <div class="text-xl font-bold">{{ loadout.loadoutName }}</div>
        </div>
    </div>
</template>

<script>
import Loadout from "@/models/loadout";

export default {
    name: "LoadoutCard",
    props: {
        loadout: Loadout,
    }
}
</script>

<style scoped>

</style>