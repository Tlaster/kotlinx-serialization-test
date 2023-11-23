import app.bsky.feed.GetAuthorFeedResponse
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlinx.serialization.json.Json

class Test {
  @Test
  fun test() {
    val json = Json {
      ignoreUnknownKeys = true
      classDiscriminator = "${'$'}type"
    }
    runCatching {
      val response = json.decodeFromString<GetAuthorFeedResponse>(JSON)
      assertNotNull(response)
    }.onFailure {
      it.printStackTrace()
    }
  }
}

const val JSON = """
  {
    "feed": [
        {
            "post": {
                "uri": "at://did:plc:z72i7hdynmk6r22z27h6tvur/app.bsky.feed.post/3ked2oybdjf2k",
                "cid": "bafyreiazvgliotwg744eastuojghxl2pehfpzggpblmqqrotcjanzvweku",
                "author": {
                    "did": "did:plc:z72i7hdynmk6r22z27h6tvur",
                    "handle": "bsky.app",
                    "displayName": "Bluesky",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:z72i7hdynmk6r22z27h6tvur/bafkreic5kmqlhrhbfnh2bx6fsetvkra4noqja5ngsnnadrvubd6jcoc3ae@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "record": {
                    "text": "Exciting news: We’re taking another step to making Bluesky an open network for public conversations.\n\nAround the end of this month, we’ll release a public web interface. With this, you’ll be able to view posts on Bluesky without being logged in on an account.",
                    "${'$'}type": "app.bsky.feed.post",
                    "langs": [
                        "en"
                    ],
                    "createdAt": "2023-11-16T17:15:16.577Z"
                },
                "replyCount": 642,
                "repostCount": 2684,
                "likeCount": 9346,
                "indexedAt": "2023-11-16T17:15:16.577Z",
                "viewer": {
                    "repost": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.repost/3keecuzewmo2g"
                },
                "labels": []
            },
            "reason": {
                "${'$'}type": "app.bsky.feed.defs#reasonRepost",
                "by": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "indexedAt": "2023-11-17T05:14:28.858Z"
            }
        },
        {
            "post": {
                "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5oyyvtfuk2e",
                "cid": "bafyreifp6flqjtsjucftu4rwn6dbzhssspnjixthwuqruetikxauw2wcdq",
                "author": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "record": {
                    "text": "Hello world from Flare",
                    "${'$'}type": "app.bsky.feed.post",
                    "embed": {
                        "${'$'}type": "app.bsky.embed.images",
                        "images": [
                            {
                                "alt": "",
                                "image": {
                                    "${'$'}type": "blob",
                                    "ref": {
                                        "${'$'}link": "bafkreifj22prze7doai27emxt7eyd74fdtinbd3url4vhjsszi72xm6kpy"
                                    },
                                    "mimeType": "image/jpeg",
                                    "size": 355684
                                }
                            }
                        ]
                    },
                    "langs": [
                        "en"
                    ],
                    "createdAt": "2023-08-24T09:20:38.385181Z"
                },
                "embed": {
                    "${'$'}type": "app.bsky.embed.images#view",
                    "images": [
                        {
                            "thumb": "https://cdn.bsky.app/img/feed_thumbnail/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifj22prze7doai27emxt7eyd74fdtinbd3url4vhjsszi72xm6kpy@jpeg",
                            "fullsize": "https://cdn.bsky.app/img/feed_fullsize/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifj22prze7doai27emxt7eyd74fdtinbd3url4vhjsszi72xm6kpy@jpeg",
                            "alt": ""
                        }
                    ]
                },
                "replyCount": 0,
                "repostCount": 0,
                "likeCount": 0,
                "indexedAt": "2023-08-24T09:20:38.385Z",
                "viewer": {},
                "labels": []
            }
        },
        {
            "post": {
                "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ou74t5l72a",
                "cid": "bafyreibgfycn3fnv35cmclywlpmmwvs7mtec6kb4zyhkukppdg2yuoet2u",
                "author": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "record": {
                    "text": "Can I quote a post with file?",
                    "${'$'}type": "app.bsky.feed.post",
                    "embed": {
                        "${'$'}type": "app.bsky.embed.record",
                        "record": {
                            "cid": "bafyreieqabk4ugwf2p3oxkaovs5kh4kdhuicqintaon7aamhrcpm6hziqq",
                            "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ou66jh7h2p"
                        }
                    },
                    "langs": [
                        "en"
                    ],
                    "createdAt": "2023-08-24T07:53:10.699Z"
                },
                "embed": {
                    "${'$'}type": "app.bsky.embed.record#view",
                    "record": {
                        "${'$'}type": "app.bsky.embed.record#viewRecord",
                        "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ou66jh7h2p",
                        "cid": "bafyreieqabk4ugwf2p3oxkaovs5kh4kdhuicqintaon7aamhrcpm6hziqq",
                        "author": {
                            "did": "did:plc:dimtkmsm4amemwipufktmydm",
                            "handle": "tlaster.bsky.social",
                            "displayName": "Tlaster",
                            "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                            "viewer": {
                                "muted": false,
                                "blockedBy": false
                            },
                            "labels": []
                        },
                        "value": {
                            "text": "Can I upload a file?",
                            "${'$'}type": "app.bsky.feed.post",
                            "embed": {
                                "${'$'}type": "app.bsky.embed.images",
                                "images": [
                                    {
                                        "alt": "",
                                        "image": {
                                            "${'$'}type": "blob",
                                            "ref": {
                                                "${'$'}link": "bafkreihiyj47yd2nqjbucp4xbi6m43afhkzjqkdc4z6npmuaiodzyeblty"
                                            },
                                            "mimeType": "image/jpeg",
                                            "size": 13682
                                        }
                                    }
                                ]
                            },
                            "langs": [
                                "en"
                            ],
                            "createdAt": "2023-08-24T07:52:38.925Z"
                        },
                        "labels": [],
                        "indexedAt": "2023-08-24T07:52:38.925Z",
                        "embeds": [
                            {
                                "${'$'}type": "app.bsky.embed.images#view",
                                "images": [
                                    {
                                        "thumb": "https://cdn.bsky.app/img/feed_thumbnail/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreihiyj47yd2nqjbucp4xbi6m43afhkzjqkdc4z6npmuaiodzyeblty@jpeg",
                                        "fullsize": "https://cdn.bsky.app/img/feed_fullsize/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreihiyj47yd2nqjbucp4xbi6m43afhkzjqkdc4z6npmuaiodzyeblty@jpeg",
                                        "alt": ""
                                    }
                                ]
                            }
                        ]
                    }
                },
                "replyCount": 0,
                "repostCount": 0,
                "likeCount": 0,
                "indexedAt": "2023-08-24T07:53:10.699Z",
                "viewer": {},
                "labels": []
            }
        },
        {
            "post": {
                "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ou66jh7h2p",
                "cid": "bafyreieqabk4ugwf2p3oxkaovs5kh4kdhuicqintaon7aamhrcpm6hziqq",
                "author": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "record": {
                    "text": "Can I upload a file?",
                    "${'$'}type": "app.bsky.feed.post",
                    "embed": {
                        "${'$'}type": "app.bsky.embed.images",
                        "images": [
                            {
                                "alt": "",
                                "image": {
                                    "${'$'}type": "blob",
                                    "ref": {
                                        "${'$'}link": "bafkreihiyj47yd2nqjbucp4xbi6m43afhkzjqkdc4z6npmuaiodzyeblty"
                                    },
                                    "mimeType": "image/jpeg",
                                    "size": 13682
                                }
                            }
                        ]
                    },
                    "langs": [
                        "en"
                    ],
                    "createdAt": "2023-08-24T07:52:38.925Z"
                },
                "embed": {
                    "${'$'}type": "app.bsky.embed.images#view",
                    "images": [
                        {
                            "thumb": "https://cdn.bsky.app/img/feed_thumbnail/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreihiyj47yd2nqjbucp4xbi6m43afhkzjqkdc4z6npmuaiodzyeblty@jpeg",
                            "fullsize": "https://cdn.bsky.app/img/feed_fullsize/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreihiyj47yd2nqjbucp4xbi6m43afhkzjqkdc4z6npmuaiodzyeblty@jpeg",
                            "alt": ""
                        }
                    ]
                },
                "replyCount": 0,
                "repostCount": 0,
                "likeCount": 0,
                "indexedAt": "2023-08-24T07:52:38.925Z",
                "viewer": {},
                "labels": []
            }
        },
        {
            "post": {
                "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5oigq2jox2t",
                "cid": "bafyreih4olfykvhmbjaxnk64vvopxf2jprqwx42z6ojcufrrg5yaxzxw34",
                "author": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "record": {
                    "text": "Can I quote this reply?",
                    "${'$'}type": "app.bsky.feed.post",
                    "embed": {
                        "${'$'}type": "app.bsky.embed.record",
                        "record": {
                            "cid": "bafyreiatgpegv4hc7xnjo6bnzslunx4ir6qdhjbmbmeq3yztpirkpbjthq",
                            "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5oigc7nrv2n"
                        }
                    },
                    "langs": [
                        "en"
                    ],
                    "createdAt": "2023-08-24T04:22:40.475Z"
                },
                "embed": {
                    "${'$'}type": "app.bsky.embed.record#view",
                    "record": {
                        "${'$'}type": "app.bsky.embed.record#viewRecord",
                        "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5oigc7nrv2n",
                        "cid": "bafyreiatgpegv4hc7xnjo6bnzslunx4ir6qdhjbmbmeq3yztpirkpbjthq",
                        "author": {
                            "did": "did:plc:dimtkmsm4amemwipufktmydm",
                            "handle": "tlaster.bsky.social",
                            "displayName": "Tlaster",
                            "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                            "viewer": {
                                "muted": false,
                                "blockedBy": false
                            },
                            "labels": []
                        },
                        "value": {
                            "text": "Can I reply this?",
                            "${'$'}type": "app.bsky.feed.post",
                            "langs": [
                                "en"
                            ],
                            "reply": {
                                "root": {
                                    "cid": "bafyreihp2t2krybub3jxyzpqwqn27slrgtye6ptjvi5mxuko6a4n27myai",
                                    "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ohjih74e22"
                                },
                                "parent": {
                                    "cid": "bafyreihp2t2krybub3jxyzpqwqn27slrgtye6ptjvi5mxuko6a4n27myai",
                                    "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ohjih74e22"
                                }
                            },
                            "createdAt": "2023-08-24T04:22:25.967Z"
                        },
                        "labels": [],
                        "indexedAt": "2023-08-24T04:22:25.967Z",
                        "embeds": []
                    }
                },
                "replyCount": 0,
                "repostCount": 1,
                "likeCount": 0,
                "indexedAt": "2023-08-24T04:22:40.475Z",
                "viewer": {
                    "repost": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.repost/3k5ontyldiv2j"
                },
                "labels": []
            },
            "reason": {
                "${'$'}type": "app.bsky.feed.defs#reasonRepost",
                "by": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "indexedAt": "2023-08-24T05:59:34.492Z"
            }
        },
        {
            "post": {
                "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5oigq2jox2t",
                "cid": "bafyreih4olfykvhmbjaxnk64vvopxf2jprqwx42z6ojcufrrg5yaxzxw34",
                "author": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "record": {
                    "text": "Can I quote this reply?",
                    "${'$'}type": "app.bsky.feed.post",
                    "embed": {
                        "${'$'}type": "app.bsky.embed.record",
                        "record": {
                            "cid": "bafyreiatgpegv4hc7xnjo6bnzslunx4ir6qdhjbmbmeq3yztpirkpbjthq",
                            "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5oigc7nrv2n"
                        }
                    },
                    "langs": [
                        "en"
                    ],
                    "createdAt": "2023-08-24T04:22:40.475Z"
                },
                "embed": {
                    "${'$'}type": "app.bsky.embed.record#view",
                    "record": {
                        "${'$'}type": "app.bsky.embed.record#viewRecord",
                        "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5oigc7nrv2n",
                        "cid": "bafyreiatgpegv4hc7xnjo6bnzslunx4ir6qdhjbmbmeq3yztpirkpbjthq",
                        "author": {
                            "did": "did:plc:dimtkmsm4amemwipufktmydm",
                            "handle": "tlaster.bsky.social",
                            "displayName": "Tlaster",
                            "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                            "viewer": {
                                "muted": false,
                                "blockedBy": false
                            },
                            "labels": []
                        },
                        "value": {
                            "text": "Can I reply this?",
                            "${'$'}type": "app.bsky.feed.post",
                            "langs": [
                                "en"
                            ],
                            "reply": {
                                "root": {
                                    "cid": "bafyreihp2t2krybub3jxyzpqwqn27slrgtye6ptjvi5mxuko6a4n27myai",
                                    "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ohjih74e22"
                                },
                                "parent": {
                                    "cid": "bafyreihp2t2krybub3jxyzpqwqn27slrgtye6ptjvi5mxuko6a4n27myai",
                                    "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ohjih74e22"
                                }
                            },
                            "createdAt": "2023-08-24T04:22:25.967Z"
                        },
                        "labels": [],
                        "indexedAt": "2023-08-24T04:22:25.967Z",
                        "embeds": []
                    }
                },
                "replyCount": 0,
                "repostCount": 1,
                "likeCount": 0,
                "indexedAt": "2023-08-24T04:22:40.475Z",
                "viewer": {
                    "repost": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.repost/3k5ontyldiv2j"
                },
                "labels": []
            }
        },
        {
            "post": {
                "uri": "at://did:plc:dimtkmsm4amemwipufktmydm/app.bsky.feed.post/3k5ohjih74e22",
                "cid": "bafyreihp2t2krybub3jxyzpqwqn27slrgtye6ptjvi5mxuko6a4n27myai",
                "author": {
                    "did": "did:plc:dimtkmsm4amemwipufktmydm",
                    "handle": "tlaster.bsky.social",
                    "displayName": "Tlaster",
                    "avatar": "https://cdn.bsky.app/img/avatar/plain/did:plc:dimtkmsm4amemwipufktmydm/bafkreifcahwcwjjuvhrq27mf24mqbpsuboxojnalocqimkhfpwr3zqpd7e@jpeg",
                    "viewer": {
                        "muted": false,
                        "blockedBy": false
                    },
                    "labels": []
                },
                "record": {
                    "text": "hello world!",
                    "${'$'}type": "app.bsky.feed.post",
                    "langs": [
                        "en"
                    ],
                    "createdAt": "2023-08-24T04:06:19.393Z"
                },
                "replyCount": 1,
                "repostCount": 0,
                "likeCount": 8,
                "indexedAt": "2023-08-24T04:06:19.393Z",
                "viewer": {},
                "labels": []
            }
        }
    ],
    "cursor": "1692849979393::bafyreihp2t2krybub3jxyzpqwqn27slrgtye6ptjvi5mxuko6a4n27myai"
}
"""