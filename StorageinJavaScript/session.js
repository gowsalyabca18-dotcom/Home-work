const btn = document.getElementById("countBtn");
const display = document.getElementById("countDisplay");

let count = sessionStorage.getItem("count") || 0;
display.textContent = count;

btn.addEventListener("click", () => {
    count++;
    sessionStorage.setItem("count", count);
    display.textContent = count;
});