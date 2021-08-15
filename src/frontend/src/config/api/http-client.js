import axios from "axios";

const httpClient = axios.create({
    baseURL: "http://localhost:9000/api/loadout/",
    headers: {
        "Content-Type": "application/json",
    },
});

export default httpClient;