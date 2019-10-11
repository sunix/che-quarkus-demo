import React from 'react';
import './App.css';
import PostInput from './components/PostInput'
import PostList from './components/PostList'
import Container from 'react-bootstrap/Container'
import Row from 'react-bootstrap/Row'

if (window._env_.REACT_APP_BACKEND_HOST.endsWith('/')) {
  window._env_.REACT_APP_BACKEND_HOST = window._env_.REACT_APP_BACKEND_HOST.slice(0, -1);
}

function App() {
  return (
    <Container>
      <Row>
        <Container>
          <PostInput/>
        </Container>
      </Row>
      <div className="separator"/>
      <Row>
        <PostList/>
      </Row>
    </Container>
  );
}

export default App;

