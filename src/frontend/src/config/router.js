import { createWebHistory, createRouter } from "vue-router";
import HomePage from "@/pages/HomePage";
import Test from "@/pages/Test";

const routes = [
    {
        path: "/",
        name: "HomePage",
        component: HomePage,
    },
    {
        path: "/test",
        name: "Test",
        component: Test,
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;