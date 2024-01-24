import axios from 'axios';

const API_URL = 'http://localhost:8080/api/personas/page';

const obtenerPersonasPaginadas = async (page, size) => {
  try {
    const response = await axios.post(API_URL, {
      params: { page, size }
    });
    console.log(response);

    return response.data;
  } catch (error) {
    throw error;
  }
};

export default {
  obtenerPersonasPaginadas
};