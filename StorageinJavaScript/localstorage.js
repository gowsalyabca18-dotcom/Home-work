const input = document.getElementById("nameInput");
const display = document.getElementById("displayName");
const btn = document.getElementById("saveBtn");


btn.addEventListener("click", () => {
    localStorage.setItem("username", input.value);
    display.textContent = input.value;
});


window.addEventListener("load", () => {
    const savedName = localStorage.getItem("username");
    if(savedName){
        display.textContent = savedName;
    }
});