import React, { Component } from 'react'
import APICallsService from '../APICallsService'

export default class Task extends Component {
    
    constructor(props){
        super(props)
        this.state={
            id: this.props.location.state.id,
            client:  this.props.location.state.client,
            project: this.props.location.state.project,
            cost: this.props.location.state.cost
        }
        this.handleSubmit = this.handleSubmit.bind(this)
        this.costChange = this.costChange.bind(this)
    }


    handleSubmit(){


        
        let id = this.state.id;
        let cost = this.state.cost;
        
        console.log("hi")

        APICallsService.updateTask(id,{         
            cost: cost 
        }).then(response => {
        alert("Updated cost successfully!") 
        this.props.history.push('/finance')})
    }

    costChange(event){

        this.setState({cost: event.target.value})
        console.log(this.state.client)

    }
    
    render() {
        return (
            <>
             <div className="form-group" style={{width: "50%", display:"inline-block"}}>
                <form onSubmit={e => {e.preventDefault() 
                this.handleSubmit()}}>
                   
                   <div className="form-group">
                        <h1>Cost</h1>
                        <input type="text" className="form-control" name="client" value={this.state.cost}  onChange={this.costChange}/ >
                   </div>
                
                </form>
                <button className="btn btn-success"  type="button" onClick={() => this.handleSubmit()}>Submit Changes</button>
                <div style={{paddingTop:"10px"}}><button className="btn btn-primary" onClick={() => this.props.history.push("/finance")}>Return To List</button></div>
             </div>
             </>
            
        )
    }
}
