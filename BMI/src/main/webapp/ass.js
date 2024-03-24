function score(sc1,sc2,sc3){
	avg=(sc1+sc2+sc3)/3
	return avg
}
sd=score(89,108,96)
sk=score(88,91,1100)
console.log(sd);
console.log(sk);
minavg=100;
if(sd>sk && sd>=minavg){
	console.log("Dolphins win the trophy")
	
}
else if(sk>sd && sk>=minavg){
		console.log("koalas win the trophy")
}
else
{
		console.log("both win the trophy")

}