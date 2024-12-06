let turn="X"
let gameover=false
const boxes=document.querySelectorAll(".box1");
const select_main = document.getElementById('main');
const reset_button = document.getElementById('btn');

let grid = ["","","","","","","","",""] 
const win=[     
    [0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8], [2,4,6]
]
let start = 0;
let count = 0;

function initial() {
    let bg_change=document.getElementById("bgturnbox")
    document.getElementById('res').innerHTML="Click the box to start playing"
    turn = "X"
    gameover=false
    grid = ["","","","","","","","",""]
    start = 0
    count = 0;
    bg_change.style.left="0px"
    bg_change.style.transition="0.5s"
    
    boxes.forEach(c => {
        c.innerHTML = ""
        c.dataset.index = start;
        start += 1
    });
}

boxes.forEach(c => {
    c.innerHTML = ""
    c.dataset.index = start;
    start += 1
});
function gamePlay() {
    select_main.addEventListener('click', (e) => {
        if (gameover == false && count < 9) {
            const selected = e.target;
            const ind = selected.dataset.index;
            grid[ind] = turn;
            
            if (selected.innerHTML == "") {
                selected.innerHTML = turn;
    
                for(let i=0;i<win.length;i++){
                    let w1=boxes[win[i][0]].innerHTML;
                    let w2=boxes[win[i][1]].innerHTML;
                    let w3=boxes[win[i][2]].innerHTML;
                    if (grid[ind] != "" && grid[ind] === w1 && grid[ind] === w2 && grid[ind] == w3){
                    document.getElementById('res').innerHTML="The Player " + turn + " Wins "
                    gameover = true;
                    break;
                        
                    }
                
                }
                changeturn();
                count += 1;
            }
        }

        reset_button.addEventListener('click', () => {
            initial();
            gamePlay();
              
        })

        if (count == 9) {
            document.getElementById('res').innerHTML="It is a draw"
        }
    })
}


function changeturn(){    
let bg_change=document.getElementById("bgturnbox")
    if(turn == "X"){
        turn = "O"
        bg_change.style.left="85px"
        bg_change.style.transition="0.5s"
    }
    else{
        turn = "X"
        bg_change.style.left="0px"
        bg_change.style.transition="0.5s"
    }
}

gamePlay();
