const axios = require("axios");

class GitClient {
  static getRepositories(userName) {
    const url = `https://api.github.com/users/${userName}/repos`;
    return axios.get(url);
  }
}

module.exports = GitClient;
