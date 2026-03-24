let arr=[23,5,47,11,8,16];
console.log(largest(arr))
function largest(ar)

{
    let large=ar[0];
    for(let i=1;i<ar.length;i++)
    {
        if(ar[i]>large)
        {
            large=ar[i];
        }
           
    }return large;
}
