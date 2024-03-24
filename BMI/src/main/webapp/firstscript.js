for (let i = 1; i <= 100; i++) {
    let output ="";
    if (i % 3 === 0) {
        output =output+ "FIZZ";
    }
    if (i % 5 === 0) {
        output =output+ "BUZZ";
    }
    console.log(output||i);

}
