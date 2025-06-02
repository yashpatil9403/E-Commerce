let boxes=document.querySelectorAll(".box");
let resetBtn=document.querySelector("#resBtn");
let newBtn=document.querySelector("#newBtn");
let msgCont=document.querySelector(".msg-container");
let msg=document.querySelector("#msg");

let turnO=true;

let winPattern=[
    [0,1,2],
    [0,3,6],
    [0,4,8],
    [1,4,7],
    [2,5,8],
    [2,4,6],
    [3,4,5],
    [6,7,8]
];

let resGame=()=>
{
    turnO=true;
    enableBoxes();
    msgCont.classList.add("hide");
}

boxes.forEach((box)=>{
    box.addEventListener("click",()=>{
      if(turnO)
      {
        box.innerText="O";
        turnO=false;
      }else{
         box.innerText="X";
        turnO=true;
      }
      box.disabled=true;
        
      checkWinner();
    });
});

let disableBoxes=()=>{
    for(let box of boxes)
    {
        box.disabled=true;
    }
}

let enableBoxes=()=>{
    for(let box of boxes)
    {
        box.disabled=false;
         box.innerText="";
    }
}



let showWinner =(winner) =>
{
    msg.innerText=`Congratulation, Winner is ${winner}`;
    msgCont.classList.remove("hide");
    disableBoxes();
}

let checkWinner = () =>{
    for(let pattern of winPattern){
        // console.log(pattern[0],pattern[1],pattern[2]);
        // console.log(boxes[pattern[0]].innerText,
        //             boxes[pattern[1]].innerText,
        //             boxes[pattern[2]].innerText)

        let posVal1=boxes[pattern[0]].innerText;
        let posVal2=boxes[pattern[1]].innerText;
        let posVal3=boxes[pattern[2]].innerText;

        if(posVal1!="" && posVal2!="" && posVal3!="" )
        {
            if(posVal1===posVal2 && posVal2===posVal3)
            {
                showWinner(posVal1);
            }
        }
       
    }
};

newBtn.addEventListener("click", resGame);
resetBtn.addEventListener("click", resGame);
