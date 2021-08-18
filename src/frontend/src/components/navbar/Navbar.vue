<template>
    <nav class="bg-OSRS-cream p-3 flex justify-between">
        <div class="flex flex-row gap-4">
            <NavbarLink :url="{ name: 'HomePage' }">
                OSRSUtilities
            </NavbarLink>
            <NavbarLink :url="{ name: 'Loadouts' }">
                My Loadouts
            </NavbarLink>
        </div>
        <div class="flex-grow flex flex-row gap-3 justify-end items-center">
            <template v-if="isAuthenticated">
                <NavbarLink :url="{ name: 'Logout' }">
                    Logout
                </NavbarLink>
            </template>
            <template v-else>
                <NavbarLink :url="{ name: 'Login' }">
                    Login
                </NavbarLink>
            </template>
        </div>
    </nav>
</template>
<script>
import NavbarLink from "@/components/navbar/NavbarLink";

export default {
    name: "Navbar",
    components: {
        NavbarLink,
    },
 // TODO: isAuthenticated
}
</script>