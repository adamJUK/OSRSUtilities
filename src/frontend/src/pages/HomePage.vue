<template>
    <div>
        <Navbar/>
    </div>
    <div class="justify-center flex bg-OSRS-maroon items-center h-screen">
        <div class="text-4xl text-OSRS-cream">
            Welcome to OSRSUtilities
        </div>
    </div>
</template>
<script>
import Navbar from "@/components/navbar/Navbar";

export default {
    name: 'HomePage',
    components: { Navbar },
};
</script>