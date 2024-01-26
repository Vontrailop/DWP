import axios from 'axios';

let API_URL = 'http://localhost:8080/api/personas/page';



const obtenerPersonasPaginadas = async (pageNum, size, sort) => {
   const page = {
      page: pageNum,
      size, sort
   };
   try {
      const response = await axios.post(API_URL, { page });

      return response.data;
   } catch (error) {
      throw error;
   }
};

export default {
   obtenerPersonasPaginadas
};