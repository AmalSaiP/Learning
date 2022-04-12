import axios from 'axios'
import React, { Component } from 'react'

 class APICallsService {

    getAllTasks(){
        return axios.get(`http://localhost:3002/deals`)
    }

    deleteTaskById(id){
        console.log(id)
        return axios.delete(`http://localhost:3002/deals/${id}`)
    }

    updateTask(id, task){
        return axios.patch(`http://localhost:3002/deals/${id}`, task)
    }

    createTask(task){
        return axios.post(`http://localhost:3002/deals/`, task)
    }

}
export default new APICallsService();