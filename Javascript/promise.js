function checkResult() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      let success = true;

      if (success) {
        resolve("Success");
      } else {
        reject("Fail");
      }
    }, 2000);
  });
}


checkResult()
  .then(res => console.log(res))
  .catch(err => console.log(err));


  function checkEvenOdd(num) {
  return new Promise((resolve, reject) => {
    if (num % 2 === 0) {
      resolve("Even Number");
    } else {
      reject("Odd Number");
    }
  });
}


checkEvenOdd(4)
  .then(res => console.log(res))
  .catch(err => console.log(err));

  function checkMarks(marks) {
  return new Promise((resolve, reject) => {
    if (marks >= 50) {
      resolve("Pass");
    } else {
      reject("Fail");
    }
  });
}


checkMarks(60)
  .then(res => console.log(res))
  .catch(err => console.log(err));