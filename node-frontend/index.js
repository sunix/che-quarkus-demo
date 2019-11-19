const express = require('express')
const proxy = require('express-http-proxy')
const path = require('path')
const app = express()


// serving react app
app.use(express.static(path.join(__dirname, 'build')))
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'build', 'index.html'))
})

// gateway post to local quarkus
app.use('/quarkus', proxy('localhost:8080'))

app.listen(3000)