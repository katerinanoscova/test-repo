theme: /

    state: newNode_42
        AIAgent:
            content = {{$session.queryText}}
            agentId = a240c220-2f2f-4de8-86f0-fa6237d5931f
            sendMessage = true
            varName = answerAIAgent
            okState = 
            errorState = 
    @BlockEvents
        {
          "global" : true,
          "boundsTo" : "",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ]
        }
    state: newNode_2
        state: 1
            event!: noMatch
            go!: /newNode_42
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_2",
                name: "newNode_2 buttons",
                handler: function($context) {
                }
            });

    state: newNode_1
        Transition:
            then = /newNode_42