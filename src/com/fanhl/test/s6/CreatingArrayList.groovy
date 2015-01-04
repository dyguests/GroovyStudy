lst = [0, 1, 3, 6, 8, 11]

println lst[0]
println lst[-1]
println lst.size()
println lst[2..5]

subLst = lst[2..5]
println subLst.dump()//教材用的是 groovy 2.1
subLst[0] = 999
println lst

lst.each{println it}

doubled=[]
lst.each{doubled<<it*2}
println doubled

println lst.collect{it+1000}

println lst.collect{it+1000}

