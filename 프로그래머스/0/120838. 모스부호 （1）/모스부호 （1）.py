def solution(letter):
    morse = {
        '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
        '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
        '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
        '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
        '-.--':'y','--..':'z'
    }
    
    answer = []
    letter = letter.split(" ")
    for i in letter :
        answer.append(morse[i])
    
    return ''.join(answer)