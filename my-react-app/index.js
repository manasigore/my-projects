const express = require('express');

const app = express();
app.use(express.static('./server/static/'));
app.use(express.static('./client/dist/'));

// start the server
app.listen(3000, () => {
  console.log('Server is running on http://localhost:3000 or http://192.168.1.208:3000');
});