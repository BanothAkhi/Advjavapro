let ratanmass=50
let ratanheight=5.9

let Anumass=40
let Anuheight=5.5

let BMIratan
let BMIAnu

BMIratan=ratanmass/(ratanheight*ratanheight)
BMIAnu=Anumass/(Anuheight*Anuheight)

console.log(`value of ratan ${BMIratan} type is ${typeof(BMIratan)}`)
console.log(`value of anu ${BMIAnu} type is ${typeof(BMIAnu)}`)


document.write("value of ratan.."+BMIratan )
document.write("value of anu.."+BMIAnu )


if(BMIratan>BMIAnu)
{
	RatanHigherBMI=true
}
else
{
	RatanHigherBMI=false
}
console.log(`value of BMIratan ${RatanHigherBMI} type is ${typeof(RatanHigherBMI)}`)
document.write("RatanHigherBMI  "+RatanHigherBMI)



