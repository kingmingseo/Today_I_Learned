queue=function(){

q=c()
q_size=0

enqueue = function(data){
  q<<- c(q,data)
  q_size<<-q_size+1
}

dequeue =function(data){
  first=q[1]
  q<<-q[-1]
  q_size<<-q_size-1
  return(first)
}

size=function(){
  return(q_size)
}

return(list(enqueue=enqueue, dequeue=dequeue ,size=size))
}

q=queue()
q$size()
q$enqueue("min")
q$size()
q$q_size=1
q$q_Size=4
q$size()
q$q