import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

class VistaCabecerapagina extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%
                }

        .btnheader{
        	background-color :#374453
        }

            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 8%; padding: var(--lumo-space-m); justify-content: flex-start; background-color:#232f3e;" theme="spacing" id="vaadinHorizontalLayout">
 <img src="https://image.freepik.com/free-vector/colorful-market-logo-with-gradient_23-2148472540.jpg" style="width: 70px; height: 70px; flex-grow: 0; flex-shrink: 0; align-self: center;">
 <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%; align-self: center;">
  <vaadin-horizontal-layout style="background-color:#778ba5">
   <vaadin-combo-box id="categoriesCombo" allow-custom-value></vaadin-combo-box>
  </vaadin-horizontal-layout>
  <vaadin-button id="offerBtn" class="btnheader" style="color:white">
    Categorias 
  </vaadin-button>
  <vaadin-button id="limpiarBtn" class="btnheader" style="color:white">
    Inicio 
  </vaadin-button>
  <vaadin-button id="offertasButton" class="btnheader" style="color:white">
    Ofertas 
  </vaadin-button>
  <vaadin-text-field placeholder="Search" style="width: 45%;visibility:hidden" id="searchInput">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button id="btnLogin" class="btnheader" style="color:white">
    Login 
  </vaadin-button>
  <vaadin-button id="btnCarrito" class="btnheader" style="color:white">
    Carrito 
  </vaadin-button>
  <vaadin-button id="perfilBtn" class="btnheader" style="color:white">
    Perfil 
  </vaadin-button>
  <vaadin-button id="adminBtn" style="flex-grow: 0;color:white" class="btnheader">
    Admin 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-cabecerapagina';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCabecerapagina.is, VistaCabecerapagina);
