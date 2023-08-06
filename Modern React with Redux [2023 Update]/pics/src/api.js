import axios from 'axios'

const searchImages = async (term) => {
    const response = await axios.get('https://api.unsplash.com/search/photos', {
        headers: {
            Authorization: 'Client-ID 6bXLdrl59XIQWxRpoBMOmDCbmo8SYzmWZoz3pbcThO0'
        },
        params: {
            query: term
        }
    });
    return response.data.results;
};

export default searchImages;