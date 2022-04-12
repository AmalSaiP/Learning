import React, { Component } from 'react'
import { Link } from 'react-router-dom'

export default class Welcome extends Component {
    render() {
        return (
            <div className="jumbotron">
                <h1>Welcome to Team Budget Planner</h1>
                <div className="container">
                    <Link className="nav-link" style={{fontSize: "20pt", textDecoration: "underline"}} to ="/tasks">Enter Planner as Product Manager</Link>
                    <Link className="nav-link" style={{fontSize: "20pt", textDecoration: "underline"}} to ="/finance">Enter Planner as Finance Team Member</Link>  
  
                </div>
            </div>
        )
    }
}
