// ideas list table

//rd table communications
$('#table-message-reply').dataTable({
  "columns": [
    { "class": "text" },
    { "class": "text" },
    { "class": "text" },
    { "class": "text" }
  ]
});

//rd table message details
$('#table-rd-message-details').dataTable({
  "columns": [
    {
      "class": "remove-sort",
      "orderable": false
    }
  ]
});

