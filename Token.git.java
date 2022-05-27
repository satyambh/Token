pragma solidity >=0.5.0 <0.6.0;

contract token{
    uint total_money;
    address deposit; // only this address can deposit money
    address[] public withdrawl; // only these address can withdraw money
    uint withdrawal_limit; // maximum amount that can be withdrawl 
    function deposits(uint money) public 
    {
        if( deposit == msg.sender) // checking whether depositor is authentic
         total_money = total_money + money;
         
    }
    function withdrawal(uint money) public{
        uint n= withdrawl.length;

        for(uint j=0 ;j< n;j++ )
        {
            if( withdrawl[j] == msg.sender && money <= withdrawal_limit && total_money >= money ) // validating required conditions
            total_money= total_money - money;
        } 
    }


}