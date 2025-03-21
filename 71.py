def simplifyPath( path: str) -> str:
    tokens = []
    directory = ""
    i = 1
    while i < len(path):
        if path[i] == '/':
            if directory != '': tokens.append(directory)
            directory = ''
        else: directory += path[i]
        i+=1
        if i==len(path) and directory != '': tokens.append(directory)
    print(tokens)
    stack = []
    for token in tokens:
        if token == '.': continue
        if token == '..':
            if len(stack)>0:
                stack.pop()
        else: stack.append(token)
    print(stack)
    answer = "/"
    for directory in stack:
        answer += directory + '/'
    if answer== '/': return answer
    else: return answer[:-1]
print(simplifyPath("/amit/amit"))