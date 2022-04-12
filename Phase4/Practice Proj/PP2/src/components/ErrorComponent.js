import React from 'react'
import PropTypes from 'prop-types'

function ErrorComponent(props) {
    return (
        <div>
            <h1> Page not found</h1>
            <button className="btn btn-primary btn-lg" onClick={()=> props.history.push("/tasks")}>Return To Tasks</button>
        </div>
    )
}

ErrorComponent.propTypes = {

}

export default ErrorComponent


