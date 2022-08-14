문제 설명
        사전식 압축기법이란 다음의 두 단계로 이루어진 압축기법입니다.

        사전 구축: 입력 문자열에서 반복되는 패턴을 찾아 사전에 추가하고 색인번호를 부여합니다.
        원문 변환: 원문을 패턴의 색인번호로 구성된 배열로 변환하여 저장합니다.
        사전식 압축기법은 구현 방식에 따라 사전 구축을 먼저 완료한 후 완성된 사전으로 원문 변환을 수행할 수도 있고, 사전 구축과 원문 변환을 동시에 수행할 수도 있습니다.

        다음 알고리즘은 'A'와 'B' 두 종류의 알파벳으로만 이루어진 원문 문자열 text가 매개변수로 주어질 때, 사전 구축과 원문 변환을 동시에 수행하는 알고리즘입니다. 이를 구현한 solution 함수를 완성해주세요.

        Step 1: 현재 위치를 원문 문자열의 첫 번째 위치로 초기화하고 사전에는 'A'와 'B'를 넣어 초기화합니다. 이때 'A'에는 색인번호 0을, 'B'에는 1을 부여합니다.
        Step 2: 문자열의 현재 위치에서부터 사전에 들어있는 가장 긴 패턴과 일치하는 부분문자열 W를 찾아 해당 색인번호를 저장합니다. 만약 원문이 전부 색인번호로 변환 및 저장되었다면 변환된 색인번호 배열을 반환하고 종료합니다.
        Step 3: 원문에서 W 바로 다음에 위치한 하나의 문자를 덧붙인 새로운 패턴을 사전에 추가합니다. 이때 추가되는 패턴의 색인번호는 1씩 증가합니다.
        Step 4: 현재 위치를 W의 바로 다음 칸으로 옮긴 후 Step 2로 돌아갑니다.
        제한사항
        1 ≤ text의 길이 ≤ 300,000
        text는 'A'와 'B' 두 종류의 알파벳(대문자)으로만 구성된 문자열입니다.
        입출력 예
        text	return
        "ABABAABAB"	[0,1,2,0,4,1]
        "BBAAA"	[1, 1, 0, 4]
        입출력 예 설명
        입출력 예 #1

        아래 그림은 입력 문자열 "ABABAABAB"에 대해 위 알고리즘을 적용하는 과정을 보여줍니다. 이 예에서 solution 함수가 반환해야 할 값은 길이 6인 정수 배열 [0, 1, 2, 0, 4, 1]입니다.

        사전_final.png

        입출력 예 #2
        입력 문자열 "BBAAA" 에 대해, 최종적으로 변환된 색인번호 배열은 [1, 1, 0, 4]이며, 완성된 사전은 다음과 같습니다.

        번호	패턴
        0	A
        1	B
        2	BB
        3	BA
        4	AA
        967834512


        nxn 크기의 정사각형 격자 퍼즐이 주어집니다. 당신은 다음 규칙에 따라 퍼즐을 해결해야 합니다.

        퍼즐의 각 칸에는 -1부터 4까지의 정수 중 하나가 채워져 있습니다.
        1, 2, 3, 4가 적힌 칸의 변에는 적힌 숫자만큼만 성냥개비를 놓아야 합니다.
        0이 적힌 칸에는 성냥개비를 놓을 수 없습니다.
        -1이 적힌 칸의 변에는 원하는 만큼 성냥개비를 놓을 수 있습니다.
        각 칸의 하나의 변에는 최대 하나의 성냥개비만 놓을 수 있습니다. 즉, 한 칸에 최대 4개까지의 성냥개비를 놓을 수 있습니다.
        퍼즐에 모든 성냥개비를 다 놓은 후, 모든 성냥개비는 전체적으로 하나의 다각형을 그려야 합니다.
        당신은 퍼즐이 주어졌을 때, 위 규칙대로 퍼즐을 해결할 수 있는 경우의 수를 구하려 합니다.

        예를 들어, 아래와 같은 퍼즐이 있다고 가정해 보겠습니다.
        num_of_board.jpg

        위 퍼즐은 아래처럼 3가지의 방법으로 해결할 수 있습니다.

        num_of_board_ex.jpg

        아래는 퍼즐을 해결하지 못한 경우의 예시입니다.

        bofn4.jpg

        첫 번째 그림은 성냥개비가 2개의 다각형을 그렸으므로 퍼즐을 해결하지 못했습니다.
        두 번째 그림은 성냥개비가 하나의 다각형도 그리지 못했으므로 퍼즐을 해결하지 못했습니다.
        세 번째 그림은 각 칸에 적힌 숫자만큼 성냥개비를 놓지 못했고 성냥개비가 2개의 다각형을 그렸으므로 퍼즐을 해결하지 못했습니다.
        네 번째 그림은 각 칸에 적힌 숫자만큼 성냥개비를 놓지 못했고 오른쪽 아래 성냥개비가 하나의 다각형에 포함되지 않았으므로 퍼즐을 해결하지 못했습니다.
        퍼즐의 정보를 담은 2차원 정수 배열 board가 주어질 때, 퍼즐을 해결할 수 있는 경우의 수를 return 하도록 solution 함수를 완성해 주세요.

        제한사항
        1 ≤ board의 가로 길이 = board의 세로 길이 ≤ 4
        -1 ≤ board의 원소 ≤ 4
        입출력 예
        board	result
        [[2, -1], [-1, 2]]	3
        [[4, -1], [-1, 4]]	0
        [[3, -1, 3], [-1, 2, -1], [3, -1, 3]]	2
        입출력 예 설명
        입출력 예 #1

        문제 예시와 같습니다.

        입출력 예 #2

        아래와 같은 경우는 성냥개비가 2개의 다각형을 만들었으므로 퍼즐을 해결하지 못한 경우입니다.

        2 (7).jpg

        어떻게 성냥개비를 놓아도 퍼즐을 풀 수 없으므로 0을 return 해야 합니다.

        입출력 예 #3

        다음과 같이 두 가지 방법으로 퍼즐을 해결할 수 있습니다.

        2 (6).jpg

        정답은 총 2개이므로 2를 return 해야 합니다.

        123456789
        #include <string>
#include <vector>

using namespace std;

        int solution(vector<vector<int>> board) {
        int answer = -1;
        return answer;
        }
        실행 결과
        실행 결과가 여기에 표시됩니다.





