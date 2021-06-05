import React from 'react';
import  Form  from './components/Form';
import List  from './components/List';
import {StoreProvider } from './components/Store';
import Categorias from './components/categorias';

function App() {
  return <StoreProvider>
    <h3>DASHBOARD</h3>
    <Categorias/>
    <Form />
    <List />
  </StoreProvider>
}

export default App;