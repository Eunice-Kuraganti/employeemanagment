import React, { Component } from 'react';

class FooterComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {date: new Date()};
      }
    render() 
    {
        return ( 
              <div className = "offset-md-11">
                  <h5 className="text-centre">{this.state.date.toLocaleTimeString()}.</h5>
                </div>
        );
    }
}
export default FooterComponent;