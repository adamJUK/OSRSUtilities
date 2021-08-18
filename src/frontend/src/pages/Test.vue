<template>
    <div>
        <Navbar/>
    </div>
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
import Navbar from "@/components/navbar/Navbar";

export default {
    name: "Test",
    components: {
      Navbar,
    },
};
</script>
