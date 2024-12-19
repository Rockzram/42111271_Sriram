let img_pos=1
const img = document.getElementById("img2")
function Next(){
    if (img_pos==1){
        img.src="./Galaxy Tab S10 series.jpg"
        img_pos=2
    }
    else if (img_pos==2) {
        img.src="https://images.samsung.com/is/image/samsung/assets/in/home/241030/HKV2-1440x640.jpg?imwidth=768"
        img_pos=3
    }
    else if(img_pos == 3){
        img.src="https://www.designinfo.in/wp-content/uploads/2024/08/Samsung-Galaxy-Watch-Ultra-47mm-LTE-Gray-9.webp"
        img_pos=4
    }
    else{
        img.src="https:/imageio.forbes.com/specials-images/imageserve/62f382e39f3f0f260a1d9c76/0x0.jpg?format=jpg&crop=3847,2372,x0,y1430,safe&height=600&width=1200&fit=bounds"
        img_pos=1   
    }
}
function Prev(){
    if (img_pos == 1){
        img.src="https://imageio.forbes.com/specials-images/imageserve/62f382e39f3f0f260a1d9c76/0x0.jpg?format=jpg&crop=3847,2372,x0,y1430,safe&height=600&width=1200&fit=bounds"
        img_pos=4   
    }
    else if (img_pos == 4){
        img.src="https://www.designinfo.in/wp-content/uploads/2024/08/Samsung-Galaxy-Watch-Ultra-47mm-LTE-Gray-9.webp"
        img_pos=3
    }
    else if(img_pos == 3){
        img.src="https://images.samsung.com/is/image/samsung/assets/in/home/241030/HKV2-1440x640.jpg?imwidth=768"
        img_pos=2
    }
    else{
        img.src="./Galaxy Tab S10 series.jpg"
        img_pos=1
    }
}