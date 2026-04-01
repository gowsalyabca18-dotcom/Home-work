function setTheme(theme){
    document.cookie = "theme=" + theme + "; path=/";
    applyTheme(theme);
}

// Get cookie
function getTheme(){
    const cookies = document.cookie.split("; ");
    for(let c of cookies){
        let [key, value] = c.split("=");
        if(key === "theme") return value;
    }
}

function applyTheme(theme){
    if(theme === "dark"){
        document.body.style.background = "black";
        document.body.style.color = "white";
    } else {
        document.body.style.background = "white";
        document.body.style.color = "black";
    }
}


window.onload = () => {
    const theme = getTheme();
    if(theme){
        applyTheme(theme);
    }
};