import React, { useState } from 'react';
import { loginUser } from '../api';

function LoginForm() {
    const [user, setUser] = useState({ email: '', password: '' });
    const [message, setMessage] = useState('');

    const handleChange = (e) => {
        setUser({ ...user, [e.target.name]: e.target.value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const res = await loginUser(user);
            setMessage(res.data);
        } catch (err) {
            setMessage('Login failed');
        }
    };

    return (
        <div>
            <h2>Login</h2>
            <form onSubmit={handleSubmit}>
                <input type="email" name="email" placeholder="Email" value={user.email} onChange={handleChange} required />
                <br />
                <input type="password" name="password" placeholder="Password" value={user.password} onChange={handleChange} required />
                <br />
                <button type="submit">Login</button>
            </form>
            <p>{message}</p>
        </div>
    );
}

export default LoginForm;
