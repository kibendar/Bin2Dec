import { axiosInstancePublic } from "../axiosInstancePublic";

export const getBinaryConversion = async (value: number) => {
  const response = axiosInstancePublic.post("/posts/1", { value }); // Adjust the endpoint as needed
  return response.then(res => res.data);
}