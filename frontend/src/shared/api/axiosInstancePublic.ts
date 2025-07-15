import axios from "axios";
import { CONFIG } from "../config/config";

export const axiosInstancePublic = axios.create({
  baseURL: CONFIG.API_BASE_URL,
  headers: {
    "Content-Type": "application/json",
  },
})