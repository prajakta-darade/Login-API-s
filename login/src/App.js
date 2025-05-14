import logo from './logo.svg';
import './styles.css';

import './App.css';
import RegisterForm from '../src/components/registrationForm';
import LoginFormForm from '../src/components/loginForm';
function App() {
  return (
    <div style={{ padding: "20px" }}>
      <h1>User Authentication</h1>
      <RegisterForm />
      <hr />
      <LoginFormForm />
    </div>
  );
}

export default App;
