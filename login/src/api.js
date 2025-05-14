import axios from 'axios';

const API_BASE_URL = "http://localhost:4242/login"; 

export const registerUser = (user) => {
    return axios.post(`${API_BASE_URL}/register`, user);
};

export const loginUser = (user) => {
    return axios.post(`${API_BASE_URL}/loginuser`, user);
};
