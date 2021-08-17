<template>
    <div class="bg-OSRS-cream">
        <h1> Loadouts </h1>
        <section>
            <ul>
                <li v-for="loadout in loadouts"
                    :key="loadout.id">
                    <div class="bg-OSRS-maroon text-OSRS-cream">
                        <label> {{ loadout.loadoutName }}</label>
                    </div>
                </li>
            </ul>
        </section>
    </div>
</template>

<script>
import { getLoadouts } from "@/config/api/loadouts.api";

export default {
    name: "Test",
    data() {
        return {
            loadouts: [],
        };
    },
    async mounted() {
        this.loadouts = await getLoadouts();
    },
};
</script>
