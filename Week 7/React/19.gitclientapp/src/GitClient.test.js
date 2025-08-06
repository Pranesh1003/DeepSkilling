const axios = require("axios"); // ✅ Don't redeclare
const GitClient = require("./GitClient"); // ✅ Use require for consistency

jest.mock("axios"); // ✅ Mock axios before using

describe('Git Client Tests', () => {
  test('should return repository names for techiesyed', async () => {
    const mockData = {
      data: [
        { name: 'Repo1' },
        { name: 'Repo2' }
      ]
    };

    axios.get.mockResolvedValue(mockData);

    const response = await GitClient.getRepositories('techiesyed');
    expect(response.data).toEqual(mockData.data);
    expect(axios.get).toHaveBeenCalledWith('https://api.github.com/users/techiesyed/repos');
  });
});
