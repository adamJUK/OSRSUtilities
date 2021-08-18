<template>
    <div>
        <Navbar/>
    </div>
    <div class="mx-3 my-5">
        <div class="grid grid-cols-1 gap-3">
            <router-link v-for="loadout in loadouts" :key="loadout.id"
                         :to="{ name: 'Loadouts'}"
                         class="hover:ring-2 focus:ring-2 focus:outline-none ring-OSRS-maroon rounded-sm">
                <LoadoutCard :loadout="loadout"/>
            </router-link>
        </div>
    </div>
</template>

<script>
import Navbar from "@/components/navbar/Navbar";
import { getLoadouts } from "@/config/api/loadouts.api";
import LoadoutCard from "@/components/loadouts/LoadoutCard";

export default {
    name: "MyLoadouts",
    data() {
        return {
            loadouts: [],
        };
    },
    components: {
        Navbar,
        LoadoutCard
    },
    async mounted() {
        this.loadouts = await getLoadouts();
    },
}
</script>
